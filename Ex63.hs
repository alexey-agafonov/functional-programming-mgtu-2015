data Expr = Const Int 
			| Var Int
			| Add Expr Expr 
			| Mult Expr Expr  
	deriving (Show, Eq)

simplify :: Expr -> Expr
simplify(Const x) = Const x
simplify(Var x) = Var x
simplify(Mult x (Const 1)) = x
simplify(Mult (Const 1) x) = x
simplify(Mult x (Var 1)) = x
simplify(Mult (Var 1) x) = x
simplify(Add x y) = Add(simplify x) (simplify y)
simplify(Mult x y) = Mult(simplify x) (simplify y)

e = Add(Mult (Var 1) (Const 10)) (Mult(Const 8) (Var 1))
e1 = Mult(Const 1) (Var 7)
e2 = Mult(Var 17) (Const 1)
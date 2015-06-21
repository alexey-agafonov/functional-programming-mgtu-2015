data Expr = Const Int 
			| Var Int
			| Add Expr Expr 
			| Mult Expr Expr 
	deriving (Show, Eq)

simplify :: Expr -> Expr
simplify(Const x) = Const x
simplify(Var x) = Var x
simplify(Add x (Const 0)) = x
simplify(Add (Const 0) x) = x
simplify(Add (Var 0) x) = x
simplify(Add x (Var 0)) = x
simplify(Add x y) = Add(simplify x) (simplify y)
simplify(Mult x y) = Mult(simplify x) (simplify y)

e = Mult(Add(Var 5) (Const 0)) (Add(Var 0) (Var 7))
e1 = Add(Const 7) (Var 3)
data Expr = Const Int 
			| Var Int
			| Add Expr Expr 
	deriving (Eq,Show)

(??) :: Bool -> Bool -> Bool
True ?? True = True
_ ?? _ = False

noVar :: Expr -> Bool
noVar (Var _) = False
noVar (Const _) = True
noVar (Add a b) = noVar a ?? noVar b

e = Add(Const 1) (Const 10)
e1 = Add(Var 7) (Const 13)
e2 = Add(Const 2) (Var 8)

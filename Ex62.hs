data Expr = Const Int 
			| Var Int 
			| Add Expr Expr 
			| Mult Expr Expr 
	deriving (Show, Eq)

numMult :: Expr -> Int
numMult (Const _) = 0
numMult (Var _) = 0
numMult (Mult a b) = 1 + numMult a + numMult b
numMult (Add a b) = numMult a + numMult b

e = Mult(Mult(Const 10) (Var 5)) (Mult(Var 12) (Var 12))
data Tree a = Empty | Node a (Tree a) (Tree a) deriving (Show, Read)

add :: Int -> Tree Int -> Tree Int
add x Empty = Node x Empty Empty
add x (Node y l r)
	| x < y = Node y (add x l) r
	| x > y = Node y l (add x r)
	| x == y = Node x l r

list :: [Int]
list = [0,-10,10,-20,20,-15,15]

generator :: [Int] -> Tree Int -> Tree Int  
generator [x] tree = add x tree
generator (x:xs) tree = generator (xs) (add x tree)

m15 :: Tree Int -> Int
m15 Empty = 1
m15 (Node x l r)
	| even x = x * m15 l * m15 r
	| otherwise = m15 l * m15 r
abc :: Float -> [Float]
abc n = [1..n]
cba :: Float -> [Float]
cba n = [sin x | x <- [1..n]]

f :: [Float] -> [Float] -> [Float]
f x [] = x
f [] y = y
f (x:xs) (y:ys) = [x] ++ [y] ++ f xs ys

main = putStr "Введите число: " >> 
     getLine >>= \z ->
   	 print (f (abc(read z :: Float)) (cba(read z :: Float)))
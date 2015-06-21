f :: Int -> IO ()
f 1000 = do print 1000
f x = do 
	print x
	f(x + 10)

main :: IO()
main = f 10
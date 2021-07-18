object Q5{
    def sumEven(n:Int):Int={
        if(n==0) return 0
        else if(n%2==0) {
            return (n + sumEven(n-2))
        }
        else sumEven(n-1)
    }
    def main(args:Array[String]){
        val n=9
        println(sumEven(n-1))
    }
    
}
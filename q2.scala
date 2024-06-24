object demo{
    var a=2
    var b=3
    var c=4
    var d=5
    var k:Float = 4.3f

    def main(args:Array[String]):Unit = {
        b-=1
        println(b*a+c*d)
        d-=1

        a+=1
        println(a)
        
        //println(-2*(g-k)+c)

        println(c)
        c+=1

        c+=1
        c*=a
        println(c)
        a+=1
    }
}
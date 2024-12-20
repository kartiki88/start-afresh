import scala.::

object helloWorld {
    @main 
    def run(): Unit = {
        /*        val ages = Seq(42, 75, 29, 64)
        println(s"The oldest person is ${ages.max}")
        val list1 =List(1,2,3,4)
        val list2=List(5,6,7,8)
        val list3=List(5,6,7,8)
        val list4 = 9::10::Nil
        println(list1++list2++list3::list4)
        println(list4)*/

        val arr = List(1, 2, 3)
        val x = arr.map(x => x*x).foldLeft(0)(_+_)
        print(x)

    }
}

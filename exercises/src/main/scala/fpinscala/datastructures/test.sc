import fpinscala.datastructures._
object test {
  val x: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
                                                  //> x  : fpinscala.datastructures.List[Int] = Cons(1,Cons(2,Cons(3,Cons(4,Cons(5
                                                  //| ,Cons(6,Cons(7,Cons(8,Cons(9,Nil)))))))))
  val doubles: List[Double] = List(1.0, 2.0, 3.0, 4.0)
                                                  //> doubles  : fpinscala.datastructures.List[Double] = Cons(1.0,Cons(2.0,Cons(3.
                                                  //| 0,Cons(4.0,Nil))))
  List.sum(x)                                     //> res0: Int = 45
  List.sum2(x)                                    //> res1: Int = 45
  List.sum3(x)                                    //> res2: Int = 45
  List.product(doubles)                           //> res3: Double = 24.0
  List.product3(doubles)                          //> res4: Double = 24.0

  List.tail(x)                                    //> res5: fpinscala.datastructures.List[Int] = Cons(2,Cons(3,Cons(4,Cons(5,Cons(
                                                  //| 6,Cons(7,Cons(8,Cons(9,Nil))))))))

  List.setHead(x, 7)                              //> res6: fpinscala.datastructures.List[Int] = Cons(7,Cons(2,Cons(3,Cons(4,Cons(
                                                  //| 5,Cons(6,Cons(7,Cons(8,Cons(9,Nil)))))))))

  List.drop(x, 2)                                 //> res7: fpinscala.datastructures.List[Int] = Cons(3,Cons(4,Cons(5,Cons(6,Cons(
                                                  //| 7,Cons(8,Cons(9,Nil)))))))

  List.dropWhile(x, (y: Int) => y <= 6)           //> res8: fpinscala.datastructures.List[Int] = Cons(7,Cons(8,Cons(9,Nil)))

  List.init(x)                                    //> res9: fpinscala.datastructures.List[Int] = Cons(1,Cons(2,Cons(3,Cons(4,Cons(
                                                  //| 5,Cons(6,Cons(7,Cons(8,Nil))))))))

  List.length(x)                                  //> res10: Int = 9

  List.length3(x)                                 //> res11: Int = 9

  List.map(x)((a: Int) => a + 2)                  //> res12: fpinscala.datastructures.List[Int] = Cons(3,Cons(4,Cons(5,Cons(6,Cons
                                                  //| (7,Cons(8,Cons(9,Cons(10,Cons(11,Nil)))))))))

  List.x                                          //> res13: Int = 3

  List.foldRight(List(1, 2, 3), Nil: List[Int])(Cons(_, _))
                                                  //> res14: fpinscala.datastructures.List[Int] = Cons(3,Cons(2,Cons(1,Nil)))

  def f = (a: Int, b: Int) => a + b               //> f: => (Int, Int) => Int

  List.foldLeft(x, (b: Int) => b)((g, a) => b => g(f(a, b)))(0)
                                                  //> res15: Int = 45

  List.map2(List(1, 2, 3))(x => x + 1)            //> res16: fpinscala.datastructures.List[Int] = Cons(4,Cons(3,Cons(2,Nil)))

  List.map4(x)(x => x + 1)                        //> res17: fpinscala.datastructures.List[Int] = Cons(2,Cons(3,Cons(4,Cons(5,Cons
                                                  //| (6,Cons(7,Cons(8,Cons(9,Cons(10,Nil)))))))))

  List.map_ans(x)(x => x + 1)                     //> res18: fpinscala.datastructures.List[Int] = Cons(10,Cons(9,Cons(8,Cons(7,Con
                                                  //| s(6,Cons(5,Cons(4,Cons(3,Cons(2,Nil)))))))))

  List.addOne(List(2, 3, 4, 5, 6, 7))             //> res19: fpinscala.datastructures.List[Int] = Cons(8,Cons(7,Cons(6,Cons(5,Cons
                                                  //| (4,Cons(3,Nil))))))

  List.filter(x)(x => (x % 2) != 1)               //> res20: fpinscala.datastructures.List[Int] = Cons(8,Cons(6,Cons(4,Cons(2,Nil)
                                                  //| )))


}

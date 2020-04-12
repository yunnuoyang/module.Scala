package com.module

/**
 * 1.scala中定义在object中的变量，方法都是静态的,object叫对象，相当于java中的单例对象。object不可以传参,Trait也不可传参。
 * * 2.scala 中一行代码后可以写“;”也可以不写，会有分号推断机制。多行代码写在一行要用分号隔开。
 * * 3.定义变量用var,定义常量用val ， a: Int ": Int" 是变量的类型，可以写也可以不写，不写会自动推断变量类型
 * * 4.scala中变量，类，对象，方法定义建议符合驼峰命名法。
 * * 5.class 是scala中的类,类可以传参，传参就有了默认的构造函数。类中的属性默认就有getter，setter方法。重写构造，第一行要调用默认的构造
 * * 6.当new 一个class时，类中除了方法不执行，其他都执行。同一个包下，class的名称不能相同。
 * * 7.scala中 如果一个class名称和object的名称一致，那么这个class叫做这个object的伴生类，这个object叫做这个class的伴生对象，他们之间可以互相访问私有变量。
 */
class Person(name:String ,age:Int){
  val myName=name;
  val myAge=age;
  var gender='m';
  def this(yname:String,yage:Int,ygender:Char){
    this(yname,yage)
    this.gender=ygender
  }


  def toIntroduce ():String ={
    return myName+"："+myAge
  }
}
object ObjAndClass {
  def main(args: Array[String]): Unit = {
//    var a=200
//
//    val person=new Person("zhangsan",20)
//    print(a+"=="+person.toIntroduce())
//    forUse()
//    print(fun(5))
//    println(hasDefault())
    hasElemts("a","b","c")
  }

  /**
   * 打印循环
   * @return
   */
  def forUse(): Any ={
    print(1 to 10)
    print(1.to(10,2))
    print(1 until(10,3))//步长为3 1-10

    for (i<- 1 to 10){
      for (j<- 1 to 10){
        println("i="+i+"j="+j)
      }
    }
  }

  /**
   * 递归函数
   * @param num 递归数值 num的阶乘
   * @return
   */
  def fun(num:Int) :Int= {
    if(num==1){
      1;
    }else{
      num*fun(num-1)
    }
  }

  /**
   *参数有默认值的函数
   * @param a
   * @param b
   * @return
   */
  def hasDefault(a:Int=20,b:Int =3): Any ={
    a*b
  }

  /**
   * 可变长参数
   * @param elems
   * @return
   */
  def hasElemts(elems:String*) ={
      elems.foreach(f=>{
        print(f)
      })
    println()
    elems.foreach(print(_))
  }

}

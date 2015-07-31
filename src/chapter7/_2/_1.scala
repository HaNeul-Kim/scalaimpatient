package chapter7._2

/**
 *
 *
 * @author Ha Neul, Kim
 * @since 2.0.5
 */

package com {
  package horstmann {
    object Utils {
      def percentOf(value: Double, rate: Double) = value * rate / 100
    }

    package impatient {
      class Employee {
        var salary = 0
        def giveRaise(rate: scala.Double) {
          //salary += Utils.percentOf(salary, rate)
        }
      }
    }
  }
}

package com {
  package horstmann {
    package impatient {
      class Manager {
        //val subordinates = new collection.mutable.ArrayBuffer[Employee]// 하단의 com.horstmann.collection 때문에 컴파일 안됨
        val subordinates = new _root_.scala.collection.mutable.ArrayBuffer[Employee]
      }
    }
  }
}

package com {
  package horstmann {
    package collection {

    }
  }
}


class _1 {

}

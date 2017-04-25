## test failed
objc[43030]: Class JavaLaunchHelper is implemented in both 
/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/bin/java (0x1042894c0) and /Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/libinstrument.dylib (0x1043514e0). One of the two will be used. Which one is undefined.

(test:executeTests) java.lang.NoClassDefFoundError: scala/Product$class

* Solution:
    http://stackoverflow.com/questions/42498035/java-lang-noclassdeffounderror-scala-productclass/42498123
    - Make sure the version of sbt, scala and scalatest compatible, in build. sbt of this project
      scalaVersion := "2.11.7"
      libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4"
    
    - After change scalaVersion, need execute reload, clean and compile in sbt console 

    - Finally, run test in sbt console
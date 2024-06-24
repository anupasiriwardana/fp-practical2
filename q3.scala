object salary{
    def salaryFromHrs(normalHrs:Int, otHrs:Int):Double = {
        return normalHrs*250.0 + otHrs*85.0
    }

    def takeHomeSalary(normalHrs:Int, otHrs:Int):Double = {
        return salaryFromHrs(normalHrs,otHrs)*0.88
    }

    def main(args:Array[String]):Unit = {
        print("Takehome salary of person with 40 normal hrs and 30 OT hrs = "+takeHomeSalary(40,30))
    }
}
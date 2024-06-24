object showProfit{
    def noOfAttendees(ticketPrice:Int):Int = {
        return ((15-ticketPrice)/5)*20 + 120
    }

    def ticketIncome(ticketPrice:Int):Double = {
        return noOfAttendees(ticketPrice) * ticketPrice
    }

    def attendeesCost(ticketPrice:Int):Double = {
        return noOfAttendees(ticketPrice)*3.0
    }

    def profit(ticketPrice:Int):Double = {
        return ticketIncome(ticketPrice) - attendeesCost(ticketPrice) - 500.0
    }

    def main(args:Array[String]):Unit = {
        println("Profit when ticket price is 10 : "+profit(10))
        println("Profit when ticket price is 15 : "+profit(15))
        println("Profit when ticket price is 20 : "+profit(20))
        println("Profit when ticket price is 25 : "+profit(25))
        println("Profit when ticket price is 30 : "+profit(30))
    }
}
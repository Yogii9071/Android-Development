fun main() {
    print("Enter amount: ")
    val amountInput = readLine()
    val amount = amountInput?.toIntOrNull()

    print("Enter membership status ('true' or 'false'): ")
    val membershipInput = readLine()
    val membership = membershipInput?.toBoolean()

    if (amount != null && amount >= 1000 && membership == true) {
        println("Congratulations! You got a 20% discount")
    } else if (amount != null && amount >= 1000 && membership == false) {
        println("Congratulations! You got a 10% discount")
    } else {
        println("Sorry, no discount")
    }
}

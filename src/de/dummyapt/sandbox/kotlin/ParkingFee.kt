package de.dummyapt.sandbox.kotlin

/**
 * You are making a car parking software that needs to calculate
 * and output the amount due based on the number of hours the car was parked.
 *
 * The fee is calculated based on the following price structure:
 * - the first 5 hours are billed at $1 per hour.
 * - after that, each hour is billed at $0.5 per hour.
 * - for each 24 hours, there is a flat fee of $15.
 *
 * This means, that, for example, if a car parked for 26 hours,
 * the bill should be 15+(2*0.5) = 16.0, because it was parked
 * for 24 hours plus 2 additional hours.
 */

fun main() {
    var hours = readLine()!!.toInt()
    var total = 0.0

    if (hours in 1..5) {
        total += hours
        println(total)
    } else if (hours in 6..23) {
        hours -= 5
        total += 5 + (hours * 0.5)
        println(total)
    } else if (hours >= 24) {
        total += 15 * (hours / 24)
        hours %= 24
        total += hours * 0.5
        println(total)
    }
}
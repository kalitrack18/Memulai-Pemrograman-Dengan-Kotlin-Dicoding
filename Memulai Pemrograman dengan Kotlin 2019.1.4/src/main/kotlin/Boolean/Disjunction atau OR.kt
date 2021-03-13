package Boolean

fun main(){
    val officeOpen = 7
    val officeClose = 16
    val now = 20

    val isClose = now < officeOpen || now > officeClose

    print("Office is closed : $isClose")
}
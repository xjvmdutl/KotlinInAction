package ch11.actualDSL

/*
class AlertDialogBuilder{
    fun positiveButton(text: String, callback: DialogInterface.() -> Unit) {}
    fun negativeButton(text: String, callback: DialogInterface.() -> Unit) {}
    //...
}
fun Context.alert(message:String, title:String, init:AlertDialogBuilder.() -> Unit )

fun Activity.showAreYouSureAlert(process:() -> Unit){
    alert(title = "Are you sure?", message = "Are you really sure?") {
        positiveButton("Yes") { process() }
        negativeButton("No") { cancel() }
    }
}


verticalLayout{
    val email = editText { //EditText 뷰 요소를 선언하고 그에 대한 참조를 저장
        hint = "Email"//이 람다의 수신 객체는 안드로이드 API가 제공하는 일반 클래스 android,.widget.EditText
    }
    val password = editText{
        hint = "Password"//EditText.setHint("Password")를 호출하는 간단한 방법
        transformationMethod =//EditText.transformationMethod(...)를 호출
            PasswordTransformationMethod.getInstance()
    }
    button("Log In"){ //새 버튼을 선언한다
        onClick{ //버튼 클릭시 하는 작업을 정의
            login(email.text, password.text) //UI요소 안에 정의한 참조를 사용해 각각의 요소에 들어있는 데이터에 접근근        }
    }
}

 */
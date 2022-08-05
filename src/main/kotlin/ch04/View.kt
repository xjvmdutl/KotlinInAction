package ch04

import javax.naming.Context
import javax.swing.text.AttributeSet

/*
interface State : Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State){}
}
 */

open class View{
    constructor(ctx: Context){
        //Code
    }
    constructor(ctx: Context, attr: AttributeSet){
        //Code
    }
}

class MyButton: View{

    constructor(ctx: Context): super(ctx){
        //Code
    }

    /*
    constructor(ctx: Context): this(ctx, MY_STYLE){
    }
    */

    constructor(ctx: Context, attr: AttributeSet): super(ctx, attr){
        //Code
    }
}
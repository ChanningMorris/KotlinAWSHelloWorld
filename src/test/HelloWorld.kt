package test

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.LambdaLogger

public class App {
    public fun handler(count: Int, context: Context): String {
        val lambdaLogger = context.getLogger()
        lambdaLogger.log("count = " + count)
        return "${count * 25}"
    }
}
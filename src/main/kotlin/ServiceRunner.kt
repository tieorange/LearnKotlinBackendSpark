import spark.Spark.get

/**
 * Created by andrii.kovalchuk on 08/05/2017.
 */

class ServiceRunner {

    fun run() {
        println("hello")
        get("/hello", { request, response ->
            "Hello spark"
        })
    }

}
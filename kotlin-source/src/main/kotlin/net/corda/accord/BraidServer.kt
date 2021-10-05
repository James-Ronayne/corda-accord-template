package net.corda.accord

import io.cordite.braid.corda.BraidConfig
import io.cordite.braid.libs.io.vertx.core.AsyncResult
import io.cordite.braid.libs.io.vertx.core.Handler
import io.cordite.braid.libs.io.vertx.core.http.HttpServerOptions
import net.corda.accord.flow.PromissoryNoteIssueFlow
import net.corda.accord.flow.PromissoryNoteIssueJSONFlow
import net.corda.core.node.AppServiceHub
import net.corda.core.node.services.CordaService
import net.corda.core.serialization.SingletonSerializeAsToken


@CordaService
class BraidServer(appServiceHub: AppServiceHub) : SingletonSerializeAsToken() {

    init {

        val braidHandler: Handler<AsyncResult<String>> = Handler { asyncResult -> System.out.println(asyncResult.result()) }

        BraidConfig()
                .withFlow("PromissoryNoteIssueFlow", PromissoryNoteIssueFlow::class.java)
                .withFlow("PromissoryNoteIssueJSONFlow", PromissoryNoteIssueJSONFlow::class.java)
                .withService("PromissoryNotesInterface", BraidService(appServiceHub))
                .withPort(appServiceHub.getAppContext().config.get("braid") as Int)
                .withHttpServerOptions(HttpServerOptions().setSsl(false))
                .bootstrapBraid(appServiceHub, braidHandler)
    }
}

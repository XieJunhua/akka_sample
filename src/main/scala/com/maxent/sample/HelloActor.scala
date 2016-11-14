package com.maxent.sample

import akka.actor.{Actor, ActorSystem, Props}
import akka.actor.Actor.Receive

/**
  * Created by xiejunhua on 16/11/14.
  */
class HelloActor extends Actor{
  override def receive: Receive = {
    case "hello" => print("hello back at you")
    case _ => print("huh?")
  }
}

object Main extends App {
  val system = ActorSystem("HelloSystem")
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! "hello"
  helloActor ! "buenos dias"
}

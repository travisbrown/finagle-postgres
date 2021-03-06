package com.twitter.finagle.postgres.codec

/*
 * An error generated by Postgres.
 */
class ServerError(message : String) extends Exception(message)

/*
 * An error caused on the client side (e.g., a badly-formed query).
 */
class ClientError(message : String) extends Exception(message)

object Errors {
  def client(message : String) = new ClientError(message)
  def server(message : String) = new ServerError(message)
}
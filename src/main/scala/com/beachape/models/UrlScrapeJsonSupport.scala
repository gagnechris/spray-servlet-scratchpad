package com.beachape.models

import spray.httpx.SprayJsonSupport
import spray.json.DefaultJsonProtocol


case class UrlScrape(url: String)

/**
 * Acts as an in-scope unmarshaller of JSON content if we
 * import this into the scope of a route
 */
object UrlScrapeJsonSupport extends SprayJsonSupport with DefaultJsonProtocol {
  implicit val UrlScrapeFormats = jsonFormat1(UrlScrape)
}
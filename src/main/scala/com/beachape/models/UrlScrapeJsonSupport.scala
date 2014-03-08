package com.beachape.models

import com.wordnik.swagger.annotations.ApiModel
import com.wordnik.swagger.annotations.ApiModelProperty

import spray.httpx.SprayJsonSupport
import spray.json.DefaultJsonProtocol


@ApiModel(description = "URL Scrape message")
case class UrlScrape(
  @ApiModelProperty(value = "TODO: url description") val url: String)

/**
 * Acts as an in-scope unmarshaller of JSON content if we
 * import this into the scope of a route
 */
object UrlScrapeJsonSupport extends SprayJsonSupport with DefaultJsonProtocol {
  implicit val UrlScrapeFormats = jsonFormat1(UrlScrape)
}
package com.github.mlangc.experiments

object Bug {
  object Listings {
    case class Info(plausiblePrices: Seq[(String, Double)] = Seq(), unplausiblePrices: Seq[(String, Double)] = Seq())
  }

  case class RegionInfo(regionName: String, listings: Listings.Info)

  case class Listings(
      forRegion: RegionInfo,
      forSupRegion: Option[RegionInfo] = None,
      forNeighbours: Seq[RegionInfo] = Seq())
}

case class Bug(
    sqmPrice: Double,
    regionName: String,
    listingCategory: String,
    listings: Bug.Listings)

package t.mk.three.jiitassignment.feature.main.repositoryimport t.mk.three.jiitassignment.StockByRankingQueryimport t.mk.three.jiitassignment.data.RankingApolloClientinterface BaseMainRepository {    suspend fun getRankingStock(isLoadSector: Boolean = false, market: String, page: Int, limit: Int, sectors: List<String>) : RankingApolloClient.Result<StockByRankingQuery.Data>}
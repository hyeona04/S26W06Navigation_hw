package kr.ac.kumoh.ce.s20230346.s26w06navigation_hw.repository
import kr.ac.kumoh.ce.s20230346.s26w06navigation_hw.model.Pokemon

interface PokemonRepository {
    suspend fun getAllPokemon(): List<Pokemon>
    suspend fun getPokemonById(id: Int): Pokemon?
}
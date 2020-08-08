package com.example.demo.article.entity

import com.example.demo.article.repository.ArticleRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
class ArticleTest {

    @Autowired
    private lateinit var articleRepository: ArticleRepository

    @Test
    fun `Save article`() {
        val article = Article(
                title = "hello, world",
                description = "this is description",
                body = "this is body"
        )
        val persisted = articleRepository.save(article)
        println(persisted.id!!)

        Assertions.assertNotNull(persisted)
    }
}
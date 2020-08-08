package com.example.demo.article.entity

import javax.persistence.*

@Entity
class Article(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,

        @Column
        var title: String? = null,

        @Column
        var description: String? = null,

        @Column
        var body: String? = null
) {
}
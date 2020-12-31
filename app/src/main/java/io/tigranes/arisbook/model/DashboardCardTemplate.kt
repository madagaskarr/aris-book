package io.tigranes.arisbook.model

enum class DashboardCardTemplate {

    BESEDA {
        override fun getStringID(): String = "io.tigranes.arisbook.model.BESEDA"
    },
    CHAPTER {
        override fun getStringID(): String = "io.tigranes.arisbook.model.CHAPTER"
    },
    QUESTION {
        override fun getStringID(): String = "io.tigranes.arisbook.model.QUESTION"
    },
    PARAGRAPH {
        override fun getStringID(): String = "io.tigranes.arisbook.model.PARAGRAPH"
    },
    SINGLE_IMAGE {
        override fun getStringID(): String = "io.tigranes.arisbook.model.SINGLE_IMAGE"
    },
    TESTIMONIAL {
        override fun getStringID(): String = "io.tigranes.arisbook.model.TESTIMONIAL"
    },
    COVER_IMAGE {
        override fun getStringID(): String = "io.tigranes.arisbook.model.COVER_IMAGE"
    };

    abstract fun getStringID(): String
}
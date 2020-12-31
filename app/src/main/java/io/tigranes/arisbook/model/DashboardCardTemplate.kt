package io.tigranes.arisbook.model

enum class DashboardCardTemplate {

    BESEDA {
        override fun getStringID(): String = "io.tigranes.arisbook.model.BESEDA"
    },
    CHAPTER {
        override fun getStringID(): String = "io.tigranes.arisbook.model.CHAPTER"
    },
    COVER_IMAGE {
        override fun getStringID(): String = "io.tigranes.arisbook.model.COVER_IMAGE"
    };

    abstract fun getStringID(): String
}
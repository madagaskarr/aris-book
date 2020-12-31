package io.tigranes.arisbook.model

enum class DashboardCardTemplate {

    BESEDA {
        override fun getStringID(): String = "io.tigranes.arisbook.model.BESEDA"
    };

    abstract fun getStringID(): String
}
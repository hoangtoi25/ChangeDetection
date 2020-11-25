package com.bernaferrari.changedetection.eventbus

/**
 * Created by PL_itto-PC on 11/26/2020
 **/
class ReloadAllDataEvent {
    var reload: Boolean = true

    constructor(reload: Boolean = true) {
        this.reload = reload
    }
}
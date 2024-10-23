package com.ozoned.customerapp.Utils

const val STATIC_FIELD = "MyAwesomeKey1"

class AppConstant {

    companion object {
                         var BASEURL = "http://116.58.20.67:1148"
//var BASEURL = "http://172.16.21.252:444"
//        var BASEURL = "https://measapi.pshealthpunjab.gov.pk/api/"
        var AppversionURL="https://hisduapps.pshealthpunjab.gov.pk/api/AppStatus/GetAppSettings?Name=MEAS"
        var TOKEN = "TOKEN"


        //        var USERTYPE = ""
        var USERID = "USERID"
        var SELECTEDROLE = "SELECTEDROLE"
        var SELECTEDMODULE = "SELECTEDMODULE"

        var HFCode = "HFCode"
        //AppVersion
        var AppVersion = "AppVersion"
        var ChecklistPrimary = "ChecklistPrimary"
        var ChecklistSceondary = "ChecklistSceondary"
        var ChecklistMACS = "ChecklistMACS"

        var DefaultDatePattern = "yyyy-MM-dd HH:mm:ss.SSS"
    }

}
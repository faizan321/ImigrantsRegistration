package com.hisdu.meas

import com.google.common.truth.Truth.assertThat
import com.hisdu.meas.ui.Indicators.MasterIndicatorsFragment
import com.hisdu.meas.ui.Indicators.SubmitFormModel

import org.junit.Test

class MasterFormTest {

    @Test
    fun validateMasterForm(){

        var dd =MasterIndicatorsFragment().validate()

        var submitmodel = SubmitFormModel()
        submitmodel.HFMISCode="0350020010050430013"
        submitmodel.applicationTypeid=1
        submitmodel.facility="0350020010050430013"
        submitmodel.facilityName="Services Hospital, Lahore"

    }


}
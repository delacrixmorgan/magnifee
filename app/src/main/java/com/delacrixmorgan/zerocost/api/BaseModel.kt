package com.delacrixmorgan.zerocost.api

import java.io.File

/**
 * com.delacrixmorgan.zerocost.api
 * ZeroCost
 *
 * Created by morgan on 21/10/2018.
 * Copyright (c) 2018 Apptivity Lab. All Rights Reserved.
 */

object BaseModel {
    data class Result(
        val file: File? = null
    )
}
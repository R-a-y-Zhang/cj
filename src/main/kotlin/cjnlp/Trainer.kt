package cjnlp

import rx.Observable
import java.io.File

data class Topic(val tag: List<String>, val texts: List<String>)

/********************************************************************************************************************
 * Class used to train up a set of basic tags and keywords. Currently used sources are:
 *  + Wikipedia
 *
 *  Directory structure is as follows
 *
 *  + <Directory Name>
 *      + training_files
 *          + ... <files used in training>
 *      + tags
 *          + <tag_name>_files <- files associated with this tag
 ********************************************************************************************************************/
class TrainingSet(fp: String) {
    val fp: String = fp
    val files: MutableMap<String, List<String>> = mutableMapOf()
    fun run() {
        File(fp).walkTopDown().iterator().forEach {
            it.read
        }
    }
}
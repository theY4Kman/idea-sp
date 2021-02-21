package org.idea_sp

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object SourcePawnFileType : LanguageFileType(SourcePawnLanguage) {
    override fun getName(): String = "SourcePawn file"

    override fun getDescription(): String = "SourcePawn language file"

    override fun getDefaultExtension(): String = "sp"

    override fun getIcon(): Icon = SourcePawnIcons.FILE
}

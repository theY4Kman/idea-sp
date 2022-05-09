import com.intellij.testFramework.ParsingTestCase
import org.idea_sp.SourcePawnParserDefinition
import org.junit.Test

class SourcePawnParsingTest : ParsingTestCase("parsing", "sp", SourcePawnParserDefinition()) {
    override fun getTestDataPath(): String = "src/test/testData"
    override fun includeRanges(): Boolean = true
    override fun skipSpaces(): Boolean = true

    @Test fun testPluginStruct() = doTest(true)
}

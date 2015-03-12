/* The following code was generated by JFlex 1.4.3 on 3/11/15 1:20 AM */

package org.idea_sp;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static org.idea_sp.psi.SourcePawnTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/11/15 1:20 AM from the specification file
 * <tt>/Users/they4kman/programming/idea-sp/src/org/idea_sp/SourcePawn.flex</tt>
 */
public class _SourcePawnLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\47\1\41"+
    "\1\6\1\0\1\56\1\71\1\43\1\57\1\60\1\5\1\53\1\66"+
    "\1\30\1\33\1\4\1\34\1\40\10\31\1\52\1\65\1\67\1\46"+
    "\1\70\1\51\1\44\6\36\24\45\1\63\1\42\1\64\1\55\1\32"+
    "\1\0\1\7\1\37\1\24\1\14\1\11\1\15\1\25\1\74\1\16"+
    "\1\45\1\72\1\20\1\26\1\17\1\23\1\21\1\45\1\12\1\10"+
    "\1\13\1\22\1\76\1\73\1\35\1\27\1\75\1\61\1\54\1\62"+
    "\1\50\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\16\5\1\6"+
    "\1\7\1\1\1\10\1\7\1\5\2\1\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\5\1\35\1\0\1\36\1\37\12\0"+
    "\13\5\1\40\1\5\1\41\7\5\1\42\1\43\4\0"+
    "\1\5\1\0\1\44\3\0\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\1\54\1\55\1\56\1\0\1\57"+
    "\1\60\1\5\11\0\1\61\4\0\17\5\1\62\1\5"+
    "\1\63\5\5\1\64\1\65\1\66\1\67\1\5\1\44"+
    "\2\70\1\71\1\72\1\5\1\73\11\0\7\5\1\74"+
    "\1\75\1\76\1\77\4\5\1\100\4\5\1\101\2\5"+
    "\1\102\1\0\2\5\10\0\1\5\1\103\2\5\1\104"+
    "\1\5\1\105\2\5\1\106\6\5\1\107\1\5\1\0"+
    "\1\64\1\110\1\111\5\0\1\112\1\113\1\114\1\115"+
    "\1\116\1\117\3\5\1\120\1\121\2\5\2\0\1\122"+
    "\1\123\1\124\2\5\1\125\1\126";

  private static int [] zzUnpackAction() {
    int [] result = new int[252];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\77\0\176\0\275\0\374\0\u013b\0\u017a\0\u01b9"+
    "\0\u01f8\0\u0237\0\u0276\0\u02b5\0\u02f4\0\u0333\0\u0372\0\u03b1"+
    "\0\u03f0\0\u042f\0\u046e\0\u04ad\0\u04ec\0\u052b\0\u03b1\0\u056a"+
    "\0\u05a9\0\u05e8\0\u0627\0\u0666\0\u06a5\0\u06e4\0\77\0\77"+
    "\0\77\0\u0723\0\u0762\0\u07a1\0\u07e0\0\77\0\77\0\77"+
    "\0\77\0\77\0\77\0\77\0\77\0\u081f\0\u085e\0\u089d"+
    "\0\u08dc\0\u091b\0\u095a\0\77\0\77\0\u0999\0\u09d8\0\u0a17"+
    "\0\u0a56\0\u0a95\0\u0ad4\0\u0b13\0\u0b52\0\u0b91\0\u0bd0\0\u0c0f"+
    "\0\u0c4e\0\u0c8d\0\u0ccc\0\u0d0b\0\u0d4a\0\u0d89\0\u0dc8\0\u0e07"+
    "\0\u0e46\0\u0e85\0\u03b1\0\u0ec4\0\u03b1\0\u0f03\0\u0f42\0\u0f81"+
    "\0\u0fc0\0\u0fff\0\u103e\0\u107d\0\77\0\77\0\u10bc\0\u10fb"+
    "\0\u113a\0\u1179\0\u11b8\0\u0627\0\77\0\u11f7\0\u1236\0\u1275"+
    "\0\77\0\77\0\77\0\77\0\77\0\77\0\77\0\77"+
    "\0\77\0\u12b4\0\u12f3\0\77\0\77\0\u1332\0\u1371\0\u13b0"+
    "\0\u13ef\0\u142e\0\u146d\0\u14ac\0\u14eb\0\u152a\0\u1569\0\u15a8"+
    "\0\u15e7\0\u1626\0\u1665\0\u16a4\0\u16e3\0\u1722\0\u1761\0\u17a0"+
    "\0\u17df\0\u181e\0\u185d\0\u189c\0\u18db\0\u191a\0\u1959\0\u1998"+
    "\0\u19d7\0\u1a16\0\u1a55\0\u1a94\0\u1ad3\0\u03b1\0\u1b12\0\u1b51"+
    "\0\u1b90\0\u1bcf\0\u1c0e\0\u1c4d\0\77\0\u113a\0\u1179\0\u1c8c"+
    "\0\u0627\0\77\0\u1236\0\77\0\77\0\u1ccb\0\u095a\0\u1d0a"+
    "\0\u1d49\0\u1d88\0\u1dc7\0\u1e06\0\u1e45\0\u1e84\0\u1ec3\0\u1f02"+
    "\0\u1f41\0\u1f80\0\u1fbf\0\u1ffe\0\u203d\0\u207c\0\u20bb\0\u03b1"+
    "\0\u03b1\0\u03b1\0\u03b1\0\u20fa\0\u2139\0\u2178\0\u21b7\0\u03b1"+
    "\0\u21f6\0\u2235\0\u2274\0\u22b3\0\u03b1\0\u22f2\0\u2331\0\u03b1"+
    "\0\u2370\0\u23af\0\u23ee\0\u242d\0\u246c\0\u24ab\0\u24ea\0\u2529"+
    "\0\u2568\0\u25a7\0\u25e6\0\u2625\0\u03b1\0\u2664\0\u26a3\0\u03b1"+
    "\0\u26e2\0\u03b1\0\u2721\0\u2760\0\u03b1\0\u279f\0\u27de\0\u281d"+
    "\0\u285c\0\u289b\0\u28da\0\u03b1\0\u2919\0\u2958\0\u2958\0\u03b1"+
    "\0\u03b1\0\u2997\0\u29d6\0\u2a15\0\u2a54\0\u2a93\0\u03b1\0\u03b1"+
    "\0\u03b1\0\u03b1\0\u03b1\0\u03b1\0\u2ad2\0\u2b11\0\u2b50\0\u03b1"+
    "\0\u03b1\0\u2b8f\0\u2bce\0\u2c0d\0\u2c4c\0\u03b1\0\u03b1\0\u03b1"+
    "\0\u2c8b\0\u2cca\0\u03b1\0\u03b1";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[252];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\20\1\22\1\23\1\24\2\20\1\25\1\26\1\27"+
    "\1\30\1\31\2\20\1\32\1\26\1\33\1\2\1\34"+
    "\1\27\1\20\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\1\56\1\57\1\60\1\20\1\61"+
    "\3\20\100\0\3\3\77\0\1\62\1\63\40\0\1\64"+
    "\76\0\1\65\37\0\1\66\1\67\1\70\1\0\1\71"+
    "\1\72\1\73\1\74\1\0\1\75\1\76\1\77\63\0"+
    "\1\20\1\100\17\20\1\0\2\20\1\0\5\20\3\0"+
    "\2\20\24\0\5\20\7\0\4\20\1\101\2\20\1\102"+
    "\1\20\1\103\7\20\1\0\2\20\1\0\5\20\3\0"+
    "\2\20\24\0\1\20\1\104\3\20\7\0\10\20\1\105"+
    "\1\106\7\20\1\0\2\20\1\0\1\20\1\107\3\20"+
    "\3\0\2\20\24\0\5\20\7\0\2\20\1\110\16\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\7\0\1\111\20\20\1\0\2\20\1\0\5\20\3\0"+
    "\2\20\24\0\5\20\7\0\2\20\1\112\11\20\1\113"+
    "\4\20\1\0\2\20\1\0\5\20\3\0\2\20\24\0"+
    "\5\20\7\0\14\20\1\114\4\20\1\0\2\20\1\0"+
    "\5\20\3\0\2\20\24\0\5\20\7\0\6\20\1\115"+
    "\12\20\1\0\2\20\1\0\5\20\3\0\2\20\24\0"+
    "\5\20\7\0\1\116\1\20\1\117\16\20\1\0\2\20"+
    "\1\0\5\20\3\0\2\20\24\0\5\20\7\0\21\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\7\0\13\20\1\120\5\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\7\0\12\20\1\121\6\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\7\0\1\122\13\20\1\123\4\20\1\0\2\20\1\0"+
    "\5\20\3\0\2\20\24\0\5\20\7\0\14\20\1\124"+
    "\4\20\1\0\2\20\1\0\5\20\3\0\2\20\24\0"+
    "\5\20\30\0\1\125\1\26\2\0\1\31\3\0\1\26"+
    "\5\0\1\126\44\0\1\26\15\0\1\26\1\127\76\0"+
    "\1\130\57\0\1\26\15\0\1\26\1\127\1\0\1\131"+
    "\1\0\1\132\46\0\3\20\1\133\15\20\1\0\2\20"+
    "\1\0\5\20\3\0\2\20\24\0\5\20\41\134\1\135"+
    "\1\136\34\134\41\137\1\0\1\140\34\137\46\0\1\141"+
    "\76\0\1\142\61\0\1\26\2\0\1\31\3\0\1\26"+
    "\5\0\1\143\4\0\1\144\71\0\1\145\5\0\1\146"+
    "\70\0\1\147\76\0\1\150\76\0\1\151\20\0\1\152"+
    "\77\0\1\153\54\0\1\154\22\0\1\155\14\0\21\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\2\20"+
    "\1\156\2\20\1\62\2\0\74\62\5\63\1\157\71\63"+
    "\10\0\1\160\77\0\1\161\77\0\1\162\4\0\1\163"+
    "\1\164\70\0\1\165\75\0\1\166\103\0\1\167\75\0"+
    "\1\170\1\0\1\171\75\0\1\172\72\0\1\173\103\0"+
    "\1\174\66\0\1\20\1\175\17\20\1\0\2\20\1\0"+
    "\5\20\3\0\2\20\24\0\5\20\7\0\1\176\2\20"+
    "\1\177\10\20\1\200\4\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\7\0\21\20\1\0\2\20"+
    "\1\0\5\20\3\0\2\20\24\0\3\20\1\201\1\20"+
    "\7\0\2\20\1\202\16\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\7\0\7\20\1\203\11\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\7\0\13\20\1\204\5\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\7\0\1\20\1\205\17\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\7\0\7\20\1\206\2\20\1\207\6\20\1\0\2\20"+
    "\1\0\5\20\3\0\2\20\24\0\5\20\7\0\4\20"+
    "\1\210\14\20\1\0\2\20\1\0\5\20\3\0\2\20"+
    "\24\0\5\20\7\0\16\20\1\211\2\20\1\0\2\20"+
    "\1\0\5\20\3\0\2\20\24\0\5\20\7\0\6\20"+
    "\1\212\6\20\1\213\3\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\7\0\3\20\1\214\15\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\7\0\4\20\1\215\14\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\7\0\21\20\1\0\2\20"+
    "\1\0\5\20\3\0\2\20\24\0\1\20\1\216\3\20"+
    "\7\0\21\20\1\0\2\20\1\0\3\20\1\217\1\20"+
    "\3\0\2\20\24\0\5\20\7\0\2\20\1\220\16\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\7\0\1\20\1\221\17\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\7\0\10\20\1\222\10\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\7\0\4\20\1\223\14\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\31\0\1\224\2\0\1\224"+
    "\3\0\1\224\71\0\1\225\52\0\1\226\1\0\1\226"+
    "\2\0\2\226\6\0\1\226\4\0\2\226\1\0\1\226"+
    "\1\0\3\226\70\0\1\227\1\0\1\227\3\0\1\227"+
    "\45\0\2\20\1\230\16\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\41\134\1\231\1\136\34\134"+
    "\43\0\1\232\33\0\2\137\1\0\40\137\1\233\33\137"+
    "\46\0\1\234\76\0\1\235\37\0\7\20\1\236\11\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\4\63\1\237\1\157\71\63\10\0\1\240\112\0\1\241"+
    "\64\0\1\242\100\0\1\243\72\0\1\244\115\0\1\245"+
    "\64\0\1\75\101\0\1\244\56\0\1\170\2\0\74\170"+
    "\24\0\1\246\71\0\1\244\66\0\1\247\103\0\1\250"+
    "\71\0\2\20\1\251\16\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\7\0\4\20\1\252\14\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\7\0\13\20\1\253\5\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\7\0\15\20\1\254\3\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\7\0\2\20\1\255\16\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\7\0\2\20\1\256\16\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\7\0\4\20\1\257\14\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\7\0\17\20\1\260\1\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\7\0\2\20\1\261\16\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\7\0\4\20\1\262\14\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\7\0\3\20\1\263\15\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\7\0\13\20\1\264\5\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\7\0\14\20\1\265\4\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\7\0\1\266\6\20\1\267"+
    "\11\20\1\0\2\20\1\0\5\20\3\0\2\20\24\0"+
    "\5\20\7\0\11\20\1\270\7\20\1\0\2\20\1\0"+
    "\5\20\3\0\2\20\24\0\5\20\7\0\21\20\1\0"+
    "\2\20\1\0\5\20\3\0\2\20\24\0\1\20\1\271"+
    "\3\20\7\0\7\20\1\272\11\20\1\0\2\20\1\0"+
    "\5\20\3\0\2\20\24\0\5\20\7\0\11\20\1\273"+
    "\7\20\1\0\2\20\1\0\5\20\3\0\2\20\24\0"+
    "\5\20\7\0\3\20\1\274\15\20\1\0\2\20\1\0"+
    "\5\20\3\0\2\20\24\0\5\20\7\0\2\20\1\275"+
    "\16\20\1\0\2\20\1\0\5\20\3\0\2\20\24\0"+
    "\5\20\7\0\1\20\1\276\2\20\1\277\14\20\1\0"+
    "\2\20\1\0\5\20\3\0\2\20\24\0\5\20\7\0"+
    "\14\20\1\300\4\20\1\0\2\20\1\0\5\20\3\0"+
    "\2\20\24\0\5\20\11\0\1\301\2\0\1\224\15\0"+
    "\1\224\53\0\1\302\20\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\7\0\11\20\1\303\7\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\11\0\1\304\100\0\1\305\106\0\1\306\71\0\1\307"+
    "\71\0\1\170\103\0\1\310\100\0\1\311\103\0\1\312"+
    "\62\0\1\313\74\0\3\20\1\314\15\20\1\0\2\20"+
    "\1\0\5\20\3\0\2\20\24\0\5\20\7\0\2\20"+
    "\1\315\4\20\1\316\11\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\7\0\15\20\1\317\3\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\7\0\21\20\1\0\2\20\1\0\5\20\3\0\2\20"+
    "\24\0\1\320\4\20\7\0\14\20\1\321\4\20\1\0"+
    "\2\20\1\0\5\20\3\0\2\20\24\0\5\20\7\0"+
    "\12\20\1\322\6\20\1\0\2\20\1\0\5\20\3\0"+
    "\2\20\24\0\5\20\7\0\15\20\1\323\3\20\1\0"+
    "\2\20\1\0\5\20\3\0\2\20\24\0\5\20\7\0"+
    "\3\20\1\324\15\20\1\0\2\20\1\0\5\20\3\0"+
    "\2\20\24\0\5\20\7\0\6\20\1\325\12\20\1\0"+
    "\2\20\1\0\5\20\3\0\2\20\24\0\5\20\7\0"+
    "\13\20\1\326\5\20\1\0\2\20\1\0\5\20\3\0"+
    "\2\20\24\0\5\20\7\0\10\20\1\327\10\20\1\0"+
    "\2\20\1\0\5\20\3\0\2\20\24\0\5\20\7\0"+
    "\1\330\20\20\1\0\2\20\1\0\5\20\3\0\2\20"+
    "\24\0\5\20\7\0\21\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\4\20\1\331\7\0\7\20\1\332"+
    "\11\20\1\0\2\20\1\0\5\20\3\0\2\20\24\0"+
    "\5\20\7\0\1\333\20\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\7\0\4\20\1\334\14\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\5\20"+
    "\7\0\7\20\1\335\11\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\30\0\1\336\1\337\2\0"+
    "\1\337\3\0\1\337\12\0\1\336\32\0\21\20\1\0"+
    "\2\20\1\0\5\20\3\0\2\20\24\0\1\340\4\20"+
    "\7\0\2\20\1\341\16\20\1\0\2\20\1\0\5\20"+
    "\3\0\2\20\24\0\5\20\12\0\1\342\102\0\1\343"+
    "\72\0\1\170\101\0\1\170\1\0\1\344\76\0\1\171"+
    "\101\0\1\345\102\0\1\346\65\0\1\170\70\0\4\20"+
    "\1\347\14\20\1\0\2\20\1\0\5\20\3\0\2\20"+
    "\24\0\5\20\7\0\15\20\1\350\3\20\1\0\2\20"+
    "\1\0\5\20\3\0\2\20\24\0\5\20\7\0\4\20"+
    "\1\351\14\20\1\0\2\20\1\0\5\20\3\0\2\20"+
    "\24\0\5\20\7\0\6\20\1\352\12\20\1\0\2\20"+
    "\1\0\5\20\3\0\2\20\24\0\5\20\7\0\21\20"+
    "\1\0\2\20\1\0\5\20\3\0\2\20\24\0\2\20"+
    "\1\353\2\20\7\0\10\20\1\354\10\20\1\0\2\20"+
    "\1\0\5\20\3\0\2\20\24\0\5\20\7\0\11\20"+
    "\1\355\7\20\1\0\2\20\1\0\5\20\3\0\2\20"+
    "\24\0\5\20\7\0\2\20\1\356\16\20\1\0\2\20"+
    "\1\0\5\20\3\0\2\20\24\0\5\20\7\0\3\20"+
    "\1\357\15\20\1\0\2\20\1\0\5\20\3\0\2\20"+
    "\24\0\5\20\7\0\2\20\1\360\16\20\1\0\2\20"+
    "\1\0\5\20\3\0\2\20\24\0\5\20\7\0\15\20"+
    "\1\361\3\20\1\0\2\20\1\0\5\20\3\0\2\20"+
    "\24\0\5\20\7\0\4\20\1\362\14\20\1\0\2\20"+
    "\1\0\5\20\3\0\2\20\24\0\5\20\7\0\10\20"+
    "\1\363\10\20\1\0\2\20\1\0\5\20\3\0\2\20"+
    "\24\0\5\20\31\0\1\337\2\0\1\337\3\0\1\337"+
    "\51\0\1\170\106\0\1\364\74\0\1\365\71\0\1\244"+
    "\71\0\1\170\76\0\4\20\1\366\14\20\1\0\2\20"+
    "\1\0\5\20\3\0\2\20\24\0\5\20\7\0\5\20"+
    "\1\367\13\20\1\0\2\20\1\0\5\20\3\0\2\20"+
    "\24\0\5\20\7\0\5\20\1\370\13\20\1\0\2\20"+
    "\1\0\5\20\3\0\2\20\24\0\5\20\7\0\14\20"+
    "\1\371\4\20\1\0\2\20\1\0\5\20\3\0\2\20"+
    "\24\0\5\20\7\0\13\20\1\372\5\20\1\0\2\20"+
    "\1\0\5\20\3\0\2\20\24\0\5\20\17\0\1\170"+
    "\101\0\1\342\63\0\3\20\1\373\15\20\1\0\2\20"+
    "\1\0\5\20\3\0\2\20\24\0\5\20\7\0\2\20"+
    "\1\374\16\20\1\0\2\20\1\0\5\20\3\0\2\20"+
    "\24\0\5\20";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11529];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\34\1\3\11\4\1\10\11\5\1\1\0"+
    "\2\11\12\0\25\1\2\11\4\0\1\1\1\0\1\11"+
    "\3\0\11\11\1\1\1\0\2\11\1\1\11\0\1\1"+
    "\4\0\30\1\1\11\4\1\1\11\1\1\2\11\2\1"+
    "\11\0\30\1\1\0\2\1\10\0\22\1\1\0\3\1"+
    "\5\0\15\1\2\0\7\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[252];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
  public _SourcePawnLexer() {
    this((java.io.Reader)null);
  }


  public _SourcePawnLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _SourcePawnLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 144) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 59: 
          { return BLOCK_COMMENT;
          }
        case 87: break;
        case 18: 
          { return LPAREN;
          }
        case 88: break;
        case 28: 
          { return AND;
          }
        case 89: break;
        case 81: 
          { return PUBLIC_KEYWORD;
          }
        case 90: break;
        case 42: 
          { return OROR;
          }
        case 91: break;
        case 23: 
          { return RBRACKET;
          }
        case 92: break;
        case 63: 
          { return EXPR;
          }
        case 93: break;
        case 84: 
          { return FORWARD_KEYWORD;
          }
        case 94: break;
        case 13: 
          { return COLON;
          }
        case 95: break;
        case 82: 
          { return DEFAULT_KEYWORD;
          }
        case 96: break;
        case 35: 
          { return MINUSEQ;
          }
        case 97: break;
        case 9: 
          { return EQ;
          }
        case 98: break;
        case 57: 
          { return LTLTEQ;
          }
        case 99: break;
        case 52: 
          { return FLOAT_LITERAL;
          }
        case 100: break;
        case 60: 
          { return ENUM_KEYWORD;
          }
        case 101: break;
        case 85: 
          { return OPERATOR_KEYWORD;
          }
        case 102: break;
        case 51: 
          { return NEW_KEYWORD;
          }
        case 103: break;
        case 76: 
          { return STRUCT_KEYWORD;
          }
        case 104: break;
        case 55: 
          { return BINARY_LITERAL;
          }
        case 105: break;
        case 71: 
          { return CONST_KEYWORD;
          }
        case 106: break;
        case 65: 
          { return CASE_KEYWORD;
          }
        case 107: break;
        case 40: 
          { return PLUSPLUS;
          }
        case 108: break;
        case 69: 
          { return SLEEP_KEYWORD;
          }
        case 109: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 110: break;
        case 75: 
          { return STATIC_KEYWORD;
          }
        case 111: break;
        case 22: 
          { return LBRACKET;
          }
        case 112: break;
        case 24: 
          { return SEMICOLON;
          }
        case 113: break;
        case 78: 
          { return SWITCH_KEYWORD;
          }
        case 114: break;
        case 25: 
          { return COMMA;
          }
        case 115: break;
        case 16: 
          { return XOR;
          }
        case 116: break;
        case 3: 
          { return DIV;
          }
        case 117: break;
        case 14: 
          { return PLUS;
          }
        case 118: break;
        case 34: 
          { return MINUSMINUS;
          }
        case 119: break;
        case 43: 
          { return XOREQ;
          }
        case 120: break;
        case 39: 
          { return PLUSEQ;
          }
        case 121: break;
        case 37: 
          { return EQEQ;
          }
        case 122: break;
        case 36: 
          { return STRING_LITERAL;
          }
        case 123: break;
        case 26: 
          { return LT;
          }
        case 124: break;
        case 44: 
          { return PERCEQ;
          }
        case 125: break;
        case 80: 
          { return NATIVE_KEYWORD;
          }
        case 126: break;
        case 4: 
          { return ASTERISK;
          }
        case 127: break;
        case 46: 
          { return LTLT;
          }
        case 128: break;
        case 10: 
          { return EXCL;
          }
        case 129: break;
        case 30: 
          { return DIVEQ;
          }
        case 130: break;
        case 8: 
          { return DOT;
          }
        case 131: break;
        case 5: 
          { return SYMBOL;
          }
        case 132: break;
        case 72: 
          { return BREAK_KEYWORD;
          }
        case 133: break;
        case 50: 
          { return FOR_KEYWORD;
          }
        case 134: break;
        case 62: 
          { return EXIT_KEYWORD;
          }
        case 135: break;
        case 41: 
          { return OREQ;
          }
        case 136: break;
        case 21: 
          { return RBRACE;
          }
        case 137: break;
        case 32: 
          { return DO_KEYWORD;
          }
        case 138: break;
        case 68: 
          { return STOCK_KEYWORD;
          }
        case 139: break;
        case 27: 
          { return GT;
          }
        case 140: break;
        case 61: 
          { return ELSE_KEYWORD;
          }
        case 141: break;
        case 47: 
          { return ANDEQ;
          }
        case 142: break;
        case 83: 
          { return DEFINED_KEYWORD;
          }
        case 143: break;
        case 29: 
          { return LINE_COMMENT;
          }
        case 144: break;
        case 31: 
          { return ASTERISKEQ;
          }
        case 145: break;
        case 15: 
          { return OR;
          }
        case 146: break;
        case 7: 
          { return INTEGER_LITERAL;
          }
        case 147: break;
        case 74: 
          { return ASSERT_KEYWORD;
          }
        case 148: break;
        case 20: 
          { return LBRACE;
          }
        case 149: break;
        case 67: 
          { return STATE_KEYWORD;
          }
        case 150: break;
        case 11: 
          { return TILDE;
          }
        case 151: break;
        case 53: 
          { return ELLIPSIS;
          }
        case 152: break;
        case 33: 
          { return IF_KEYWORD;
          }
        case 153: break;
        case 70: 
          { return TAGOF_KEYWORD;
          }
        case 154: break;
        case 73: 
          { return WHILE_KEYWORD;
          }
        case 155: break;
        case 38: 
          { return NE;
          }
        case 156: break;
        case 56: 
          { return CHARACTER_LITERAL;
          }
        case 157: break;
        case 66: 
          { return GOTO_KEYWORD;
          }
        case 158: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 159: break;
        case 86: 
          { return CONTINUE_KEYWORD;
          }
        case 160: break;
        case 79: 
          { return RETURN_KEYWORD;
          }
        case 161: break;
        case 6: 
          { return MINUS;
          }
        case 162: break;
        case 45: 
          { return LE;
          }
        case 163: break;
        case 19: 
          { return RPAREN;
          }
        case 164: break;
        case 12: 
          { return QUEST;
          }
        case 165: break;
        case 17: 
          { return PERC;
          }
        case 166: break;
        case 77: 
          { return SIZEOF_KEYWORD;
          }
        case 167: break;
        case 48: 
          { return ANDAND;
          }
        case 168: break;
        case 64: 
          { return DECL_KEYWORD;
          }
        case 169: break;
        case 54: 
          { return HEX_LITERAL;
          }
        case 170: break;
        case 58: 
          { return GTGTEQ;
          }
        case 171: break;
        case 49: 
          { return PREPROCESSOR_COMMENT;
          }
        case 172: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

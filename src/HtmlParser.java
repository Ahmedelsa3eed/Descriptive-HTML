/* Generated By:JavaCC: Do not edit this line. HtmlParser.java */
public class HtmlParser implements HtmlParserConstants {
  String text = ">";
  String link = "";

  public static void main(String args[]) {
    while(true) {
                try {
                  HtmlParser htmlParser = new HtmlParser(System.in);
                  while(true) {
                    System.out.println(htmlParser.Input());
                  }
                }catch(Exception e) {
                  System.out.println(e.getMessage());
                  continue;
                }
    }
  }

/** Root production. */
  final public String Input() throws ParseException {
                  String res="";
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 8:
      jj_consume_token(8);
      res = element();
      jj_consume_token(LINE);
      break;
    case END:
      jj_consume_token(END);
                                              System.exit(0);
      break;
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    this.text = ">";
    {if (true) return res;}
    throw new Error("Missing return statement in function");
  }

  final public String element() throws ParseException {
                    String s="";
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 9:
      s = img();
      break;
    case 10:
      s = header();
      break;
    case 11:
      s = para();
      break;
    case 13:
      s = url();
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    {if (true) return s;}
    throw new Error("Missing return statement in function");
  }

  final public String img() throws ParseException {
  String s = "", tmp = "";
  Token t1;
  Token t2;
    jj_consume_token(9);
    t1 = jj_consume_token(QUOTE);
    tmp = sentence();
    t2 = jj_consume_token(QUOTE);
    s = "<img src=\u005c""+ tmp + "\u005c"" + " />";
    {if (true) return s;}
    throw new Error("Missing return statement in function");
  }

  final public String header() throws ParseException {
                   String s="", tmp="";
    jj_consume_token(10);
    tmp = decorated_text();
    s="<h1 " + tmp + this.text + "</h1>";
    {if (true) return s;}
    throw new Error("Missing return statement in function");
  }

  final public String para() throws ParseException {
                 String s="", tmp="";
    jj_consume_token(11);
    tmp = decorated_text();
    if(!tmp.isEmpty()) {
      s = "<p "+ "style=\u005c""+ tmp + "\u005c"" + this.text +"</p>";
    }else{
      s = "<p " + this.text +"</p>";
    }
    {if (true) return s;}
    throw new Error("Missing return statement in function");
  }

  final public String decorated_text() throws ParseException {
                           String s="", tmp1="", tmp2=""; Token t = null;
    tmp1 = decorated_text_();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AND:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_1;
      }
      t = jj_consume_token(AND);
      label_2:
      while (true) {
        tmp2 = decorated_text();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 12:
          ;
          break;
        default:
          jj_la1[3] = jj_gen;
          break label_2;
        }
      }
    }
    if(t != null)
        s = tmp1 + tmp2;
    else
        s = tmp1;
    {if (true) return s;}
    throw new Error("Missing return statement in function");
  }

  final public String decorated_text_() throws ParseException {
                            String s="", s2="";
    jj_consume_token(12);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        text();
        break;
      case 15:
        s2 = color();
        break;
      case 16:
        s2 = font();
        break;
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
      case 15:
      case 16:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_3;
      }
    }
    if(!s2.isEmpty()) {
      {if (true) return s2;}
    }
    {if (true) return "";}
    throw new Error("Missing return statement in function");
  }

  final public String url() throws ParseException {
                String s="", tmp="";
    jj_consume_token(13);
    tmp = decorated_url();
    if(!tmp.isEmpty()) {
                s = "<a " + this.link + " style=\u005c""+ tmp + "\u005c"" + this.text + "</a>";
    }else {
                s = "<a " + this.link + this.text + "</a>";
    }
    {if (true) return s;}
    throw new Error("Missing return statement in function");
  }

  final public String decorated_url() throws ParseException {
                          String s="", tmp1="", tmp2=""; Token t = null;
    tmp1 = decorated_url_();
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AND:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_4;
      }
      t = jj_consume_token(AND);
      label_5:
      while (true) {
        tmp2 = decorated_url();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 12:
          ;
          break;
        default:
          jj_la1[7] = jj_gen;
          break label_5;
        }
      }
    }
    if(t != null)
        s = tmp1 + tmp2;
    else
        s = tmp1;
    {if (true) return s;}
    throw new Error("Missing return statement in function");
  }

  final public String decorated_url_() throws ParseException {
                           String s2="";
    jj_consume_token(12);
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        text();
        break;
      case 15:
        s2 = color();
        break;
      case 16:
        s2 = font();
        break;
      case 13:
        link();
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 13:
      case 14:
      case 15:
      case 16:
        ;
        break;
      default:
        jj_la1[9] = jj_gen;
        break label_6;
      }
    }
    if(!s2.isEmpty()) {
      {if (true) return s2;}
    }
    else {
      {if (true) return "";}
    }
    throw new Error("Missing return statement in function");
  }

  final public void link() throws ParseException {
  String s="", tmp="", tmp2="";
  Token t1,t2, t3=null;
    jj_consume_token(13);
    t1 = jj_consume_token(QUOTE);
    tmp = sentence();
    t2 = jj_consume_token(QUOTE);
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ALPHANUMERIC:
        ;
        break;
      default:
        jj_la1[10] = jj_gen;
        break label_7;
      }
      t3 = jj_consume_token(ALPHANUMERIC);
      tmp2 = decorated_text();
    }
    if(t3 != null)
        this.link = "href=" + t1.toString() + tmp + t2.toString()+ " "+ tmp2;
    else
        this.link = "href=" + t1.toString() + tmp + t2.toString() + tmp2;
  }

  final public void text() throws ParseException {
               String s=""; Token t1,t2;
    jj_consume_token(14);
    t1 = jj_consume_token(QUOTE);
    s = sentence();
    t2 = jj_consume_token(QUOTE);
    this.text += s;
  }

  final public String color() throws ParseException {
                  String s="", tmp=""; Token t1,t2;
    jj_consume_token(15);
    t1 = jj_consume_token(QUOTE);
    tmp = sentence();
    t2 = jj_consume_token(QUOTE);
    s = "color:" + tmp + ";";
    {if (true) return s;}
    throw new Error("Missing return statement in function");
  }

  final public String font() throws ParseException {
                 String s="", tmp=""; Token t1,t2;
    jj_consume_token(16);
    t1 = jj_consume_token(QUOTE);
    tmp = sentence();
    t2 = jj_consume_token(QUOTE);
    s = "font-family:" + tmp + ";";
    {if (true) return s;}
    throw new Error("Missing return statement in function");
  }

  final public String sentence() throws ParseException {
  Token t = null;
  String s="";
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ALPHANUMERIC:
        ;
        break;
      default:
        jj_la1[11] = jj_gen;
        break label_8;
      }
      t = jj_consume_token(ALPHANUMERIC);
      s = sentence();
    }
    if(t != null)
        {if (true) return t.toString()+s;}
    else {if (true) return s;}
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public HtmlParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[12];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x140,0x2e00,0x20,0x1000,0x1c000,0x1c000,0x20,0x1000,0x1e000,0x1e000,0x8,0x8,};
   }

  /** Constructor with InputStream. */
  public HtmlParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public HtmlParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new HtmlParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public HtmlParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new HtmlParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public HtmlParser(HtmlParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(HtmlParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[17];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 12; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 17; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}

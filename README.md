# Associated with Alexandria University

## Descriptive-HTML
A simple grammar for a declarative language that defines the web page instead of the HTML (JavaCC).

### Grammer
```
create  → "ADD" element
element → img | header | para | url

img     → "IMAGE" "WITH" "SOURCE" quote sentence quote
header  → "HEADING" decorated_text
para    → "PARAGRAPH" decorated_text
url     → "LINK" decorated_url

decorated_text → decorated_text "AND" decorated_text | text | color | font
decorated_url → decorated_text "AND" decorated_text | text | color | font | link

text    → "WITH" "TEXT" quote sentence quote
link    → "WITH" "LINK" quote sentence quote
color   → "WITH" "COLOR" quote sentence quote
font    → "WITH" "FONT" quote sentence quote

sentence → sentence alphanumeric | 𝛆
quote   → "“"
alphanumeric → "0"-"9" | "a"-"z" | "A"-"Z" | "/" | ":" | "."
```


## Грамматика языка в EBNF нотации
|   |   | 
|--|-- 
`<program>` ::= |   \{`<functionDecl>` \}
`<functionDecl>`  ::= |       "let" ( `<type>` \| "void") `<name>` "(" ( `<param_list>` )? ")" `<block>`
`<param_list>` ::= |   `<type>` `<name>` \{"," `<param_list>` \}
`<block>` ::= | "{" \{ (`<expr>` ";" \| `<operator>`) \} "}"
`<type>` ::= |       "Integer" \| "String" \| "Boolean"
`<operator>` ::= | `<block>`  \| `<assign_operator>` ";" \|    `<var_declaration>` ";"  \|  `<if_operator>`  \| "return" \{ `<expr>` \} ";"
`<var_declaration>` ::= | `<type>` `<name>` ":=" `<expr>` 
`<assign_operator>` ::= | `<name>` ":=" `<expr>` 
`<if_operator>` ::= | "if" "(" `<expr>` ")" `<operator>`  ( "else" `<operator>` )?
`<expr>` ::= |                `<expr>` `<log_eq_op>` `<log_expr>`   \|  `<log_expr>`
`<log_eq_op>` ::= | "==" \| "!="
`<log_expr>` ::= |            `<log_expr>` `<log_neq_op>` `<add_expr>` \| `<add_expr>` 
`<log_neq_op>` ::= | "<" \| ">" \| "<=" \| ">=" 
`<add_expr>` ::= |       ( `<add_expr>` )? `<add_op>` `<prod_expr>` \| `<prod_expr>` 
`<add_op>` ::= | "+" \| "-"
`<prod_expr>` ::= |     `<elem_expr>` `<prod_op>` `<prod_expr>`  \| `<elem_expr>`
`<prod_op>` ::= | "*" \| "\\" \| "%"
`<elem_expr>` ::= |   `<name>` \| `<constant>` \| "(" `<expr>` ")" \| `<name>` "(" \( `<arg_list>` )? ")"
`<arg_list>` ::= | `<expr>` \{ "," `<arg_list>` \}
`<constant>` ::= | `<string_const>` \| `<number_const>` \| `<boolean_const>`
`<name>` ::= |  ( `<letter>` \| "\_" ) \{ `<letter>` \| "_" \| `<digit>` \}
`<string_const>` ::= |  "\\"" \{^\\"\} "\\""
`<number_const>` ::= | [1-9] \{ `<digit>` \} \| "0"
`<boolean_const>` ::= | "true" \| "false"
`<letter>` ::= | `<low_letter>` \| `<up_letter>`
`<low_letter>` ::= | [a-z]
`<up_letter>` ::= | [A-Z]
`<digit>` ::= | [0-9]

Используемые обозначения:
* `{}` ::= повтор терма 0 и более раз
* `()?` ::=  встречается единожды или отсутствует 
* `[]` ::= regex-вставка, используется для упрощения проверки строки

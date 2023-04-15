
## Правила описания программы в целом
|   |   |  
--|--
`<program>` ::=          |`<program>` `<functionDecl>`  <br /> \|$\epsilon$
`<functionDecl>`  ::=        |`let` `<type>` `<func_name>` `(` `<paramList>` `)` `<block>`<br />\|`let` `void` `<func_name>` `(` `<param_list>` `)` `<block>`
`<param_list>` ::=   | `<param_list>` `<type>` `<name>` \| $\epsilon$
`<block>` ::= | `{` `<descr_list>` `}`
`<type>` ::=        |`Integer`\|`String`\|`Boolean`
`<descr_list>`  ::= |  `<expr>`  `<descr_list>` `;` \|  `<operator>` `<descr_list>`  \| $\epsilon$
`<operator>`::= |`<block>` <br/> \| `<assign_operator>` <br/> \|    `<var_declaration>`  <br/> \|  `<if_operator>` <br/> \| `return` `<expr>` | `return` `;`
`<if_operator>` ::= | `if` `(` `<expr>` `)` `<operator>` \| `if` `(` `<expr>` `)` `<operator>` `else` `<operator>`
`<expr>` ::=                | `<expr>` `<log_eq_op>` `<log_expr>`  <br/> \|  `<log_expr>`
`<log_eq_op>` ::=| `==` \| `!=`
`<log_expr>` ::=            | `<log_expr>` `<log_neq_op>` `<add_expr>`<br/> \| `<add_expr>` 
`<log_neq_op>` ::=| `<` \|`>` \|`<=` \|`>=` 
`<add_expr>` ::=            | `<add_expr>` `<add_op>` `<prod_expr>` <br/> \|`<add_op>` `<prod_expr>`  <br/> \| `<prod_expr>` 
`<add_op>` ::=  |`+` \| `-`
`<prod_expr>` ::=     | `<elem_expr>` `<prod_op>` `<prod_expr>`<br/>  \| `<elem_expr>`
`<prod_op>` ::=  | `*` \| `\`\| `%`
`<elem_expr>` ::= |   `<name>` \| `<constant>` \| `(` `<expr>` `)` \| `<name>` `(` `)`
`<arg_list>` ::= | `<expr>` `<arg_list>` \| $\epsilon$
`<constant>` ::= |`<string_const>` \| `<number_const>` \| `<boolean_const>`
`<id>`::=        |[-A-Za-z_0-9]+ 
`<string_const>`::=        |[A-Za-z_0-9]*
`<number_const>`::=        |[0-9]+
`<boolean_const>`::=        |`true` \| `false`


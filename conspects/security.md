
**Spring security**

**Основные компоненты:**\

**SecurityContextHolder** - содержит информация о текущем контексте безопасности. Использует **ThreadLocal** для хранения информации о пользователе(**Principal**). Это позволяет методам в том-же потоке получать эту информацию.\
Стратегию хранения можно изменить используя статический метод **.setStrategyName(String strategy)**.
- THREAD_LOCAL - (default) позволяет методам в том-же потоке получать Principal.
- MODE_GLOBAL - (для автономного приложения) все потоки приложения используют один контекст безопасности
- INHERITABLE_THREAD_LOCAL - потоки порожденные безопасным потоком наследуют контекст безопасности

**SecurityContext** - содержит объект **Authentication** и если необходимо, информацию системы безопасности связанную с запросом.\
**Authentication** - представляет пользователя (**Principal**) с точки зрения Spring Security.\
**GrantedAuthority** - содержит роли пользователя. (ROLE_USER, ROLE_ADMIN).\
**UserDetails** - предоставляет информацию для построения объекта **Authentication** из DAO объектов или других источников.\
UserDetails содержит имя, пароль, флаги: isAccountNonExpired, isAccountNonLocked, isCredentialsNonExpired, isEnabled и роли пользователя.\
**UserDetailsService** - используется чтобы создать UserDetails путем реализации единственного метода этого интерфейса.

**Аутентификация:**\
1 логин и пароль объединяются в **UsernamePasswordAuthenticationToken**(имплементирует Authentication) после чего он передается экземпляру AuthenticationManager для проверки.\
2 AuthenticationManager при несоответствие имени/пароля -> **BadCredentialsException**. при успехе -> полностью заполненный Authentication.\
3 Передаем заполненный Authentication в SecurityContextHolder.getContext().setAuthentication(…).


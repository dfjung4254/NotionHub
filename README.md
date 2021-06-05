# NotionHub

### Notion에서 작성한 마크다운 파일로 손쉽게 포스팅을 연동하는 기술블로그 서비스

### Schedule

- 21.05.14 : initial commit
- 21년 말까지 운영환경 구축 및 release

### Tech Stack

- **Frontend**
    - Framework : `Nuxt js ^5.15` / `Bootstrap-vue ^2.21`
    - Test : `Jest ^26.6`
- **Backend**
    - Framework : `Springboot 2.4` / `Java 11`
    - Test : `Junit5`
- **Backend2**
    - Framework : `Django` / `Python3`
- **Infra**
    - Server : `GCE` + `Docker`
    - CI/CD : `Github Action`

### About Branch

- `master` : for production release
- `dev` : for development
- `jkh` : my private branch for local development

### Branch Usage

- Don't commit `master` and `dev` branch directly.
- To commit `master` branch, Merge from `dev` branch to `master`.
- To commit `dev` branch, make your `${yours}` branch and PR to `dev` .

### Local Running

```jsx
> SPRING_PROFILES_ACTIVE=local java -jar notionhub-0.0.1-SNAPSHOT.war
```

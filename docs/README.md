## 구현 기능

### 회원가입 기능
	목적: 사용자가 계정을 만들 수 있도록 회원가입 기능을 구현한다.   
	시나리오
		- 사용자는 닉네임과 이메일, 비밀번호를 입력해 회원가입한다.
        - 사용자가 이미 존재하는 이메일을 입력한 경우, 메시지를 띄운다. 
    세부 정보
        - firebase의 인증을 사용해 회원가입 기능을 구현한다.
        - 입력된 이메일을 firebase의 걔정 데이터에서 찾아 중복 여부를 확인한다.
        - 입력된 이메일이 중복되지 않는 경우 firebase의 인증에 사용자의 닉네임과 이메일을 저장한다.


### 로그인 기능
    목적: 사용자가 존재하는 계정을 인증할 수 있도록 로그인 기능을 구현한다. 
    시나리오 
        - 사용자는 이메일과 비밀번호를 입력해 로그인한다. 
        - 사용자가 입력한 이메일과 비밀번호가 일치할 경우, 메인 페이지로 이동한다. 
        - 사용자가 입력한 이메일과 비밀번호가 일치하지 않을 경우, 로그인 실패 메시지를 띄운다
    세부 정보
        - firebase의 인증을 사용해 로그인 기능을 구현한다.  
        - 입력된 이메일과 비밀번호가 firebase의 걔정 데이터의 값과 일치할 경우, 인증에 성공한다. 
        - 입력된 이메일과 비밀번호가 firebase의 걔정 데이터의 값과 일치하지 않는 경우, 인증에 실패한다.



## 구조
```
.
├── application
│   └── AndroidApp.kt
├── di
│   └── AppModule.kt
├── domain
│   ├── data
│   │   ├── AuthManager.kt
│   │   ├── AuthSource.kt
│   │   ├── FirebaseAuthSource.kt
│   │   ├── Login.kt
│   │   └── User.kt
│   └── repository.kt
│       ├── AuthRepository.kt
│       ├── AuthRepositoryImpl.kt
│       └── UserRepository.kt
├── presentation
│   ├── MainActivity.kt
│   └── MainViewModel.kt
└── ui
    └── theme
        ├── Color.kt
        ├── Shape.kt
        ├── Theme.kt
        └── Type.kt
```

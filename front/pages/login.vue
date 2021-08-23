<style>
.loginForm {
  background-color: rgba(0, 0, 0, 0.75);
  width: 450px;
  height: 550px;
  display: inline-block;
  margin-top: 30px;
  padding: 30px;
}
.loginItems {
  color: whitesmoke;
  height: 40%;
}
.loginBody {
  height: 60%;
  padding-top: 20px;
}
.loginButton {
  margin-top: 30px;
}
.loginTitle {
  font-size: 100px;
}
.loginMent {
  font-size: 20px;
}
.loginSignUp {
  margin-top: 20px;
  color: darkgray;
}
.container {
  text-align: center;
}
</style>

<template>
  <div class="container">

    <b-row class="loginForm">
      <b-col class="loginItems">
        <div class="loginTitle">LOGIN</div>
        <div class="loginMent">가입한 이메일주소로 로그인 해주세요.</div>
      </b-col>
      <b-col class="loginBody">

        <b-form @submit="signIn" @reset="onReset">

          <b-form-group label="" label-for="loginEmail"
            description="We'll never share your email with anyone else."
          >
            <b-form-input
              id="loginEmail"
              v-model="loginInfo.email"
              type="email"
              placeholder="Enter email"
              required
            ></b-form-input>
          </b-form-group>

          <b-form-group label="" label-for="loginPassword">
            <b-form-input
              id="loginPassword"
              v-model="loginInfo.password"
              placeholder="Enter password"
              type="password"
              required
            ></b-form-input>
          </b-form-group>

          <b-button class="loginButton" type="submit" block variant="outline-light">Login</b-button>
        </b-form>

        <div class="loginSignUp" v-on:click="signUp">회원가입</div>

      </b-col>
    </b-row>

  </div>
</template>

<script>
export default {

  name: "login",

  data() {
    return {
      loginInfo: {
        email: '',
        password: ''
      }
    }
  },

  methods: {

    // 로그인
    signIn() {

    },

    // 회원가입
    signUp() {

    },

    onReset(event) {
      event.preventDefault()
      // Reset our form values
      this.clearForm();
    }

  }

}
</script>

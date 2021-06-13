<style>
.mainHeader {

}
</style>

<template>
  <div class="mainHeader">
    <b-navbar type="dark" variant="faded">
      <b-navbar-nav class="ml-auto">
        <b-nav-item class="navigateMenu" v-on:click="navigate('/')">HOME</b-nav-item>
        <b-nav-item class="navigateMenu" v-on:click="navigate('/guestbook')">GUESTBOOK</b-nav-item>
        <b-nav-item class="navigateMenu" v-on:click="navigate('/test')">TEST</b-nav-item>
        <b-nav-item class="navigateMenu" v-on:click="navigate('/login')">LOGIN</b-nav-item>
      </b-navbar-nav>
    </b-navbar>
  </div>
</template>

<script>
export default {
  name: "notion_header",
  methods: {
    navigate(path) {
      this.$router.push(path);
    },



  }
}
</script>
<style>
.navigateMenu {
  cursor: default;
}
</style>

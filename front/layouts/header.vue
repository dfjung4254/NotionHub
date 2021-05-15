<template>
  <div>
    <b-navbar type="light" variant="light">
      <b-navbar-brand href="#" v-on:click="navigate('/')">NotionHub</b-navbar-brand>
      <b-navbar-nav>
        <b-nav-item v-on:click="printConsole('This is contents')">Print</b-nav-item>
        <b-nav-item v-on:click="navigate('/test')">GoTest</b-nav-item>
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


    printConsole(contents) {
      console.log(contents);
    }
  }
}
</script>
<style>

</style>

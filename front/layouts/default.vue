<template>
    <div class="windowBody" :style="backgroundStyleOption">
      <notion_header />
      <Nuxt />
    </div>
</template>

<script>
import Notion_header from "~/layouts/header";

export default {

  components: {Notion_header},

  data() {

    let backgroundStyleOption = {
      backgroundImage: '',

    };

    return {
      backgroundStyleOption
    }
  },

  async fetch() {
    // TODO: 각 유저에 맞는 배경 반환
    this.backgroundStyleOption.backgroundImage = 'linear-gradient(#ffffff00, #000000e0), url("https://notionhub-webcontents.s3.ap-northeast-2.amazonaws.com/background/images/19066.jpg")';
  },



}
</script>

<style>
html {
  scrollbar-width: none; /* For Firefox */
  -ms-overflow-style: none; /* For Internet Explorer and Edge */
}
html::-webkit-scrollbar {
  width: 0px; /* For Chrome, Safari, and Opera */
}
.windowBody {
  height: 100vh;
  padding: 10vh 20vw;
  background-blend-mode: multiply;
}
</style>
